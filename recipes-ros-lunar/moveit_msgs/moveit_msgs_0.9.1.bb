# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=14;endline=14;md5=24ca93924f03642fbbd06efa2e6d00df"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation message_runtime object_recognition_msgs octomap_msgs sensor_msgs shape_msgs std_msgs trajectory_msgs"
SRC_URI = "https://github.com/ros-gbp/moveit_msgs-release/archive/release/lunar/moveit_msgs/0.9.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b061a71edc2473d3123710fc6b366a8"
SRC_URI[sha256sum] = "fe34a6b249503009b23fd79a5e129edac6b0580d218751854b9b11ca909765e5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
