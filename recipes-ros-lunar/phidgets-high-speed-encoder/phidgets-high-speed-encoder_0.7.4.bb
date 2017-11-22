# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets high speed encoder devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin libphidget21 message-generation message-runtime phidgets-api roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_high_speed_encoder/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f218abbd1bfc4c8d13ee62cc9bef7cb"
SRC_URI[sha256sum] = "921fb3bd0fd14b99f30f6110e8b92b8c70ac1790525ab5463fd0494ce69fef3f"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-phidgets_high_speed_encoder-0.7.4-0"

inherit catkin
