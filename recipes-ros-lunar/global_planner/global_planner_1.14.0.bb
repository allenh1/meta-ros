# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A path planner library and node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=81c5ac698fccad7b710cdf405fda25f7"

DEPENDS = "angles catkin costmap_2d dynamic_reconfigure geometry_msgs nav_core nav_msgs navfn pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/global_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a556f8d2e46629ed601f414d9308c572"
SRC_URI[sha256sum] = "cc19a395de00e85c47f5baaa2338d05966131676ed9d4094a6bf8a0a067f6581"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
