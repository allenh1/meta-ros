# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "geometry_msgs provides messages for common geometric primitives
    such as poin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/geometry_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "318798c9f80baca82041b2f0dd2ef1bd"
SRC_URI[sha256sum] = "75325424d2f22eeee28f60a919be636990d16067572a8310b71bb63a61bbcfbb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
