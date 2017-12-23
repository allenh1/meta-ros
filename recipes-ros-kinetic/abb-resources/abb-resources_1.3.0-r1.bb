# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_resources/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5dfbc05366fbdbafe4338c206d59002"
SRC_URI[sha256sum] = "26d97f8ab376d314e765b682243f0566d151ab825cdd026ed71d9d12efbdc7ff"
S = "${WORKDIR}/abb-release-release-kinetic-abb_resources-1.3.0-1"

inherit catkin
