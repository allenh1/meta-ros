# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to convert messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs catkin-native roscpp socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/socketcan_bridge/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "417f5c6f93b577599febe46efff99c9d"
SRC_URI[sha256sum] = "c3174576be868ef6189755e94f495e3157200a19b3d30439df00d77b9e8cfed1"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-socketcan_bridge-0.7.6-0"

inherit catkin
