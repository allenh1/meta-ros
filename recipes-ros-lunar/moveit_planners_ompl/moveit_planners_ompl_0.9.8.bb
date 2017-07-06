# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin dynamic_reconfigure eigen_conversions moveit_core moveit_ros_planning ompl pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners_ompl/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3be86defd36fda32010045b5057eeaa5"
SRC_URI[sha256sum] = "0490019cca590d8ff2f79bd44e2442c2877cee7ffb762b191b7825db6c718e4b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
