# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/rviz_python_tutorial/0.10.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de93513c227cb4d01e0c253848cd355e"
SRC_URI[sha256sum] = "ccac390af09277fe296e339f10b31dbc142daa341aa4ee0a78ee9dca610fdcab"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
