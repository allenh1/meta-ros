# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages, services and actions used by MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime object-recognition-msgs octomap-msgs sensor-msgs shape-msgs std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit_msgs-release/archive/release/lunar/moveit_msgs/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b061a71edc2473d3123710fc6b366a8"
SRC_URI[sha256sum] = "fe34a6b249503009b23fd79a5e129edac6b0580d218751854b9b11ca909765e5"
S = "${WORKDIR}/moveit_msgs-release-release-lunar-moveit_msgs-0.9.1-0"

inherit catkin
