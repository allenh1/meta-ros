# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosparam contains the rosparam command-line tool for getting and     setting ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-pyyaml rosgraph"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosparam/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9dc067eec43b6249f587c8c421e3a379"
SRC_URI[sha256sum] = "dd0da3785f8918589ff947afe0e0b3253bb474bfce5a07b7c656991234b4b8b7"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosparam-1.13.5-0"

inherit catkin
