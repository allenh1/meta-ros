# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_generation message_runtime"
SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/lunar/std_srvs/1.11.2-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08e2caa5861635abf7f37667d7f9828d"
SRC_URI[sha256sum] = "57a93df7bd701d43661bef6febc3b8594ab499b3af0eb64d4266591804b21f07"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
