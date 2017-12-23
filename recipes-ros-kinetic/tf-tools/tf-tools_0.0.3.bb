# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools and scripts relates to tf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nav-msgs tf"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/tf_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca347ba5d3457584d3d3e6e206d420fe"
SRC_URI[sha256sum] = "e3c2f3524ebb86c4063a304e5b89c04d4b12fbbf65ebc1f6f8a816c73e8e9528"
S = "${WORKDIR}/srv_tools-release-release-kinetic-tf_tools-0.0.3-0"

inherit catkin
