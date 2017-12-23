# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot gazebo package includes a launch file for simulating DENSO robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native gazebo-ros-control gazebo-ros-pkgs joint-state-controller joint-trajectory-controller"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_gazebo/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0001763ccc63c2c326feb480b9342c9"
SRC_URI[sha256sum] = "f24252867c93a3da35f54a5ba245be1961030b4d3ef232a5b7d715f1be43bca9"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_gazebo-3.0.2-0"

inherit catkin
