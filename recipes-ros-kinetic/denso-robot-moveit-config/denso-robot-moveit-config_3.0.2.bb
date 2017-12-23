# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher xacro"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_moveit_config/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2dcf54bdd7fa055612597a09f32df5d1"
SRC_URI[sha256sum] = "f45d8597c262262d2a90ee3223ba6cf16b2c277e2357d42fad999a882a23a0f4"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_moveit_config-3.0.2-0"

inherit catkin
