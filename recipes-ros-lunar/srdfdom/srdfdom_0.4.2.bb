# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules console-bridge liburdfdom-headers-dev libtinyxml urdf urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53fb55281952c1c37cb85842167d6899"
SRC_URI[sha256sum] = "17325367e98333f0c2ad7c987606745c19b8dccbc0945b9b73bce601f49c2988"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.4.2-0"

inherit catkin
