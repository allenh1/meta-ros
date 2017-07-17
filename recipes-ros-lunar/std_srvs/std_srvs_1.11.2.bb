# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=8f992788c00917ead7814b8c9005d4ae"

DEPENDS = "catkin message_generation message_runtime"
SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/lunar/std_srvs/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08e2caa5861635abf7f37667d7f9828d"
SRC_URI[sha256sum] = "57a93df7bd701d43661bef6febc3b8594ab499b3af0eb64d4266591804b21f07"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
