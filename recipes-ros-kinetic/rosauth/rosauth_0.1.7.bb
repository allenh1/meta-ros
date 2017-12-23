# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libssl-dev message-generation message-runtime roscpp rostest"
SRC_URI = "https://github.com/gt-rail-release/${PN}-release/archive/release/kinetic/${PN}/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14374cc1839f61af639a71dc5be00f7a"
SRC_URI[sha256sum] = "b77263b92aed05aef959a32cefc664967c7d1ac842a92d9ac84820126e41042f"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.7-0"

inherit catkin
