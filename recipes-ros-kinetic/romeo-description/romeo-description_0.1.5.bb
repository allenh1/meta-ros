# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The romeo_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters robot-state-publisher roscpp sensor-msgs tf urdf xacro"
SRC_URI = "https://github.com/ros-aldebaran/romeo_robot-release/archive/release/kinetic/romeo_description/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d59fd9c277ffa2abbb384fec36d83c4"
SRC_URI[sha256sum] = "0bdfd0b3e21fbc88572fc35d8918e1db00d01930df987f118efec96c63ff4ee0"
S = "${WORKDIR}/romeo_robot-release-release-kinetic-romeo_description-0.1.5-0"

inherit catkin
