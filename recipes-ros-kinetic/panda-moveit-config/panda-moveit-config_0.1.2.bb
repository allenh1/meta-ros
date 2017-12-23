# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A partly automatically generated package with all the configuration and launch f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native franka-description joint-state-publisher joint-trajectory-controller moveit-commander moveit-kinematics moveit-planners-ompl moveit-ros-control-interface moveit-ros-move-group moveit-ros-visualization robot-state-publisher rospy xacro"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/panda_moveit_config/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b5746d57d3170bdf970555758c5d71e"
SRC_URI[sha256sum] = "7f27c5bef2396e46683c971c2fc7ceaa7d1d3573ee78cc715ded4ac94578b209"
S = "${WORKDIR}/franka_ros-release-release-kinetic-panda_moveit_config-0.1.2-0"

inherit catkin
