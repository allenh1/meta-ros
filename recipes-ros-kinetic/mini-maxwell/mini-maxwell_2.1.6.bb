# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mini_maxwell"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure roslib"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/mini_maxwell/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d18fe0d133522a00d5ea0572e2a91c1b"
SRC_URI[sha256sum] = "c8ca722697205c3e265c0fae1cc964dbc36a0ad1cecc4f9bc6b7f814e5321d24"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-mini_maxwell-2.1.6-0"

inherit catkin
