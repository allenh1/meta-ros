# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "control_msgs contains base messages and actions useful for
    controlling robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=63d479f27a95c3cf74eebdf43f9b67ea"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation message_runtime std_msgs trajectory_msgs"
SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/lunar/control_msgs/1.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "424f2ee590234ec1cb7795e0ff807272"
SRC_URI[sha256sum] = "3e3bb7111fae456f04d1abdeb8f0bdebd4f1548ae34796bea6d917f7b20e4835"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
