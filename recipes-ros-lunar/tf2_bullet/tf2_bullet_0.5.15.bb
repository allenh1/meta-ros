# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "bullet catkin geometry_msgs pkg-config tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_bullet/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "465aeb376513c49e8ada0c38398d4da8"
SRC_URI[sha256sum] = "15f5cb4e9e6bef621b252d03c9a41465fd8cc9ebdf4316ace1bf96a3ebf2d759"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
