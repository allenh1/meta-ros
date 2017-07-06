# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mavros_msgs defines messages for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3LGPLv3BSD"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=c4ba05a85e41aed3f3861ec78997656b"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_msgs/0.19.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "023edb2cd8d90589c539a45f8325a055"
SRC_URI[sha256sum] = "2d2a5889ff808d415e1b0c4c6a1f961a8ea7cb094740df68ed9ec528c3eb2e79"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
