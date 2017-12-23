# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the thormang3_msgs (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native thormang3-action-module-msgs thormang3-feet-ft-module-msgs thormang3-head-control-module-msgs thormang3-manipulation-module-msgs thormang3-offset-tuner-msgs thormang3-walking-module-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-msgs-release/archive/release/kinetic/thormang3_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "694475b87a3b60c945244adc0aafe58e"
SRC_URI[sha256sum] = "9a5922e01380be468848ed83b0712040a25baee7529729c948932f44e72d9ed2"
S = "${WORKDIR}/ROBOTIS-THORMANG-msgs-release-release-kinetic-thormang3_msgs-0.2.2-0"

inherit catkin
