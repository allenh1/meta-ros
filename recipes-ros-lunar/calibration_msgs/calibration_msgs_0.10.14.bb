# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for storing calibration samples
     to be used in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=1bed50e49c0dc6cea4444e2e1c0854ef"

DEPENDS = "catkin geometry_msgs message_generation message_runtime sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/calibration_msgs/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "beafa1e581e0e2ab4de37c0e358a82cc"
SRC_URI[sha256sum] = "8d50e980661d0ee38679c595ed2493ac31e92332fa3bb4939b315bba75422e96"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
