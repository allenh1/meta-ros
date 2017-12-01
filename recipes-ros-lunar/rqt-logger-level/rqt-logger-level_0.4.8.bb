# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_logger_level provides a GUI plugin for configuring the logger level of ROS n"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding rosnode rospy rosservice rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_logger_level-release/archive/release/lunar/rqt_logger_level/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be1d381988b65bbd62cf96714d2522f0"
SRC_URI[sha256sum] = "4223103aa11dea9a75a600dc72a35129430a96adc51f606d2130dc27bc24664c"
S = "${WORKDIR}/rqt_logger_level-release-release-lunar-rqt_logger_level-0.4.8-0"

inherit catkin
