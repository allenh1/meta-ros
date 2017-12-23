# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abb-irb6640-support catkin-native industrial-robot-simulator joint-state-publisher moveit-planners-ompl moveit-ros-move-group moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher xacro"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb6640_moveit_config/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3687bd01a2463ad00b30ea61510c691"
SRC_URI[sha256sum] = "28ebe744b4dade2ab5eeaf74c462936c2e2cefbaa88eb547ac0ac78d537f57ad"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb6640_moveit_config-1.3.0-1"

inherit catkin
