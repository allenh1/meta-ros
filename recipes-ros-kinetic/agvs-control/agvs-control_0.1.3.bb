# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_control package. Config files used for Gazebo motor controllers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_sim-release/archive/release/kinetic/agvs_control/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9afe990def0b0e082366a0cf65b59dc7"
SRC_URI[sha256sum] = "fe1247d62037c2e144845f3cee3ee51d645a03bf97db906a3c9cc53d89d24e11"
S = "${WORKDIR}/agvs_sim-release-release-kinetic-agvs_control-0.1.3-0"

inherit catkin
