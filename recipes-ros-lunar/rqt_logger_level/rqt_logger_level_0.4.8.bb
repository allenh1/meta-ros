# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_logger_level provides a GUI plugin for configuring the logger level of ROS n"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding rosnode rospy rosservice rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_logger_level-release/archive/release/lunar/rqt_logger_level/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be1d381988b65bbd62cf96714d2522f0"
SRC_URI[sha256sum] = "4223103aa11dea9a75a600dc72a35129430a96adc51f606d2130dc27bc24664c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
