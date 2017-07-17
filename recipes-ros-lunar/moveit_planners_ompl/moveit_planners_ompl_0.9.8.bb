# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MoveIt interface to OMPL"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=783c099cc9582b018ca5923a51597829"

DEPENDS = "catkin dynamic_reconfigure eigen_conversions moveit_core moveit_ros_planning ompl pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners_ompl/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3be86defd36fda32010045b5057eeaa5"
SRC_URI[sha256sum] = "0490019cca590d8ff2f79bd44e2442c2877cee7ffb762b191b7825db6c718e4b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
