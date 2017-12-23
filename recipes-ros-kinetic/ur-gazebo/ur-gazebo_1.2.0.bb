# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo wrapper for the Universal UR5/10 robot arms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager effort-controllers gazebo-ros gazebo-ros-control joint-state-controller joint-trajectory-controller robot-state-publisher ur-description"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_gazebo/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "52b43f1ea37ddce36f932479ed5bb935"
SRC_URI[sha256sum] = "10491817debaef65d794423e8ad8e7c53d15302cfa0feb6102a2991f72825401"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_gazebo-1.2.0-0"

inherit catkin
