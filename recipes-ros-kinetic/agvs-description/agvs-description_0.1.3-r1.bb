# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_description package. Robot description. Urdf and mesh files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-runtime roscpp std-msgs std-srvs tf"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_common-release/archive/release/kinetic/agvs_description/0.1.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e10556d683e1c32b59d865495a12902"
SRC_URI[sha256sum] = "c9baa844569cef40231442ddd9bd68daeb4c9c93c98511cbe3f383b70393d095"
S = "${WORKDIR}/agvs_common-release-release-kinetic-agvs_description-0.1.3-1"

inherit catkin
