# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds the diagnostic messages which provide the
    standardized in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=465a293088d885a805c10a46dde365ec"

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/diagnostic_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74afa8965114b3f49203463e8e675435"
SRC_URI[sha256sum] = "75e3dbe597f2beb7ff7aa2e3dd848c177c32cbf83ba03dbd68962ff73b21db11"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
