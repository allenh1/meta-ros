# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides messages and serializations / conversion for the ."
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=24ca93924f03642fbbd06efa2e6d00df"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/octomap_msgs-release/archive/release/lunar/octomap_msgs/0.3.3-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2b9fe7cd123ea7ff2440f536f0e69558"
SRC_URI[sha256sum] = "7b38d036f7b47aa407a8ac06dc5eb9ee6c2895ed442c7ced5b9cf76edbc1359d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
