# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains test and demo programs for the katana_driver stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=2eb7eb9871ffb9e46903c859ef928179"

DEPENDS = "actionlib catkin control_msgs roscpp sensor_msgs trajectory_msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_tutorials/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2243f0532b1d5ec2f5a12cc9dd1a38d"
SRC_URI[sha256sum] = "8a7411411d3c7336b7ae62296493878fd5d638372a41902b0b7323e94498251e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
