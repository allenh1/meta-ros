# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot ros stack constains libraries, configuration files, and ROS node"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "bcap-core bcap-service bcap-service-test catkin-native denso-robot-bringup denso-robot-control denso-robot-core denso-robot-core-test denso-robot-descriptions denso-robot-gazebo denso-robot-moveit-config"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_ros/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a853e77b83dff31ab3f5e58ffe1bf00c"
SRC_URI[sha256sum] = "4e2fecabc1ab322a4702fa496287c02da112f623ccf264b31df97f63890fef88"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_ros-3.0.2-0"

inherit catkin
