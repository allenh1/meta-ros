# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abb-irb2400-moveit-plugins abb-irb2400-support catkin-native industrial-robot-simulator joint-state-publisher moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher xacro"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb2400_moveit_config/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84d7e087022b549707c95ea86d14cafc"
SRC_URI[sha256sum] = "85bd87058e31b801f3fe09095d227ee7784899d6fb819e97c039d1b3a8ee37b7"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb2400_moveit_config-1.3.0-1"

inherit catkin
