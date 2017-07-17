# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "boost catkin cmake_modules libconsole-bridge-dev liburdfdom-headers-dev tinyxml urdf urdfdom_py"
SRC_URI = "https://github.com/ros-gbp/srdfdom-release/archive/release/lunar/srdfdom/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53fb55281952c1c37cb85842167d6899"
SRC_URI[sha256sum] = "17325367e98333f0c2ad7c987606745c19b8dccbc0945b9b73bce601f49c2988"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
