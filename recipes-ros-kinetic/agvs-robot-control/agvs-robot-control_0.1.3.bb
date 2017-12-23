# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_robot_control package. Robot controller that interacts with Gazebo moto"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ackermann-msgs catkin-native diagnostic-msgs diagnostic-updater geometry-msgs message-generation message-runtime nav-msgs robotnik-msgs roscpp sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_sim-release/archive/release/kinetic/agvs_robot_control/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0f3e7399b8828c51e1971d58f67d14e"
SRC_URI[sha256sum] = "eea289928174804be2f07c480b31fbd7d0ac4412424a84b45abdbde5fef58e83"
S = "${WORKDIR}/agvs_sim-release-release-kinetic-agvs_robot_control-0.1.3-0"

inherit catkin
