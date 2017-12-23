# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher joy moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-ros-warehouse moveit-simple-controller-manager robot-state-publisher rviz tra1-description warehouse-ros xacro"
SRC_URI = "https://github.com/tork-a/minas-release/archive/release/kinetic/tra1_moveit_config/1.0.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "86f868cec925d2e69f3b891849520b72"
SRC_URI[sha256sum] = "76580042bf5600a7541d8981df276f4c6845ec0dc0139a37ae1c6cbf73832268"
S = "${WORKDIR}/minas-release-release-kinetic-tra1_moveit_config-1.0.7-1"

inherit catkin
