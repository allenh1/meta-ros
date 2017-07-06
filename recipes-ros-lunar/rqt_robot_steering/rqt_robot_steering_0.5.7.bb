# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs python-rospkg python_qt_binding rostopic rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_steering-release/archive/release/lunar/rqt_robot_steering/0.5.7-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "79f1138d4cfe483c3a23484c17344353"
SRC_URI[sha256sum] = "f354b597272c2c948987f237e3e20c3dd1a26e6fbd472ee59fa1058edbc9d71d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
