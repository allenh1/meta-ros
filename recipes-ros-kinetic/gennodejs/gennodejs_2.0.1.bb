# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Javascript ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/RethinkRobotics-release/${PN}-release/archive/release/kinetic/${PN}/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3aa931bb59e3e78c04746c9d8f5c9619"
SRC_URI[sha256sum] = "5a17bc95869c18c3e5a951a694621addbf3f1d81c916e9ae873e9821c320c3f1"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.0.1-0"

inherit catkin
