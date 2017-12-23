# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager-msgs hardware-interface pluginlib realtime-tools"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be05c98473f351f9fbd5cb034dda1d33"
SRC_URI[sha256sum] = "f53d1d0e3ecea25a3c5c902f11ede1c7668a8154957d9ca64f230e710118f0dc"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager-0.13.0-0"

inherit catkin
