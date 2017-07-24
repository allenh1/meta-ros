# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A path planner library and node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin costmap-2d dynamic-reconfigure geometry-msgs nav-core nav-msgs navfn pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/global_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a556f8d2e46629ed601f414d9308c572"
SRC_URI[sha256sum] = "cc19a395de00e85c47f5baaa2338d05966131676ed9d4094a6bf8a0a067f6581"
S = "${WORKDIR}/navigation-release-release-lunar-global_planner-1.14.0-0"

inherit catkin
