# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=fe6a07ee75db997e0a74d91b3b60fb3a"

DEPENDS = "actionlib_msgs catkin message_generation message_runtime sensor_msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_msgs/1.1.2-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b2b652127be4e095ee98745af24aa9e"
SRC_URI[sha256sum] = "ede3c57e8d0704ad0224dadf3821eb9ab18e145319303fa2f5a83ddbd062720f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
