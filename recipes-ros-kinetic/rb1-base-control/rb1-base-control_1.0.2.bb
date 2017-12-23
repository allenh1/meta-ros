# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager controller-manager-msgs diff-drive-controller joint-state-controller robot-state-publisher twist-mux"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_sim-release/archive/release/kinetic/rb1_base_control/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9459c911b5a16bbd89492269b285281"
SRC_URI[sha256sum] = "01ebea3b6c6e19181d58e687f0e0d342abf47fcfc2719337fa944da1e35eea30"
S = "${WORKDIR}/rb1_base_sim-release-release-kinetic-rb1_base_control-1.0.2-0"

inherit catkin
