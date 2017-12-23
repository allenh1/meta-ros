# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomblock_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-description joint-state-publisher robot-state-publisher rviz urdf xacro"
SRC_URI = "https://github.com/tork-a/roomblock-release/archive/release/kinetic/roomblock_description/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab0e99622bf0f2cb844337bf5d903245"
SRC_URI[sha256sum] = "dc731325d4b4d206ed931f5ee2d23e7177faa0d9384c7e078549969ed5d90a34"
S = "${WORKDIR}/roomblock-release-release-kinetic-roomblock_description-0.0.2-0"

inherit catkin
