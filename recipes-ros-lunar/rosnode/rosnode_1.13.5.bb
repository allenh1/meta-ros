# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosnode is a command-line tool for displaying debug information     about ROS , "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rosgraph rostest rostopic"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosnode/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a7f20691cbd85ab193241ca9acaff25"
SRC_URI[sha256sum] = "9a964369181c612f6dcb7a3a234c7b6f5ddf28c23d91782e429e5b21669c994a"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosnode-1.13.5-0"

inherit catkin
