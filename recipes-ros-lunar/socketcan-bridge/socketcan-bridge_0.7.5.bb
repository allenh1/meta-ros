# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to convert messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs catkin roscpp socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/socketcan_bridge/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc8ed77eda92460142423cac8ec4fa8f"
SRC_URI[sha256sum] = "355ccee72fdae8e5ced296644936684d08be6e7ea65d69cb136a92a17e7e599d"
S = "${WORKDIR}/ros_canopen-release-release-lunar-socketcan_bridge-0.7.5-0"

inherit catkin
