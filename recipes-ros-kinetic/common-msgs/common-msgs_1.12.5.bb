# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "common_msgs contains messages that are widely used by other ROS packages.     Th"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs stereo-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/common_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4047a5b47bb755e8f823dcf165a1d1f6"
SRC_URI[sha256sum] = "664f2dfcc9b090f1d9c5001182e2fda4ecd06046b15f618ea5f870218ce69dca"
S = "${WORKDIR}/common_msgs-release-release-kinetic-common_msgs-1.12.5-0"

inherit catkin
