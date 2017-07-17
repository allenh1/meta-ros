# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for commonly used sensors, including
    cameras a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=81ca042f2710438c8a427b95020948ac"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/sensor_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c209290e5730d8c0438d99ca065123aa"
SRC_URI[sha256sum] = "c80efd453f93e150b06d0cb1d2817fc3de6c132df539d8d45f19db2c5ef84554"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
