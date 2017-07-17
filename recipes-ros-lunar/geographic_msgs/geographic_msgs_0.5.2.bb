# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for Geographic Information Systems."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=b7cc876bd741fc3e1d33f2c52b979180"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs uuid_msgs"
SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/lunar/geographic_msgs/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0404ca6aaf48113d6ac1d0e10522d5f8"
SRC_URI[sha256sum] = "46b6413a350233f4110e7b2d1be5906881bb8fcd74dbe9bcebdaa748e73d58a7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
