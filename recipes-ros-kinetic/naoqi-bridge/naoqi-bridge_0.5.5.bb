# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta package to interface ROS with Aldebaran's NAOqi."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native naoqi-apps naoqi-bridge-msgs naoqi-driver naoqi-driver-py naoqi-pose naoqi-sensors-py naoqi-tools"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_bridge/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fd369ed857a81b6b9d4b22adf2dd5b66"
SRC_URI[sha256sum] = "f491bc954ee6ca0e305ae504adacb58ec901d504cd1790d821f68400619e1aa4"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_bridge-0.5.5-0"

inherit catkin
