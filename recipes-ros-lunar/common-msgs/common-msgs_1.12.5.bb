# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "common_msgs contains messages that are widely used by other ROS packages.     Th"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native catkin diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs stereo-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/common_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8cee590d21758bed2194165322044cca"
SRC_URI[sha256sum] = "f70264f6da8a11a8fc17b82a9564593f878395a470d346afdf6a0862ad54e345"
S = "${WORKDIR}/common_msgs-release-release-lunar-common_msgs-1.12.5-0"

inherit catkin
