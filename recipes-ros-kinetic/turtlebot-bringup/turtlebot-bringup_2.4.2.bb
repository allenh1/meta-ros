# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_bringup provides roslaunch scripts for starting the TurtleBot base fun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "astra-launch catkin-native create-node depthimage-to-laserscan diagnostic-aggregator freenect-launch kobuki-bumper2pc kobuki-capabilities kobuki-node kobuki-safety-controller laptop-battery-monitor openni2-launch realsense-camera robot-pose-ekf robot-state-publisher rocon-app-manager rocon-bubble-icons turtlebot-capabilities turtlebot-description yocs-cmd-vel-mux zeroconf-avahi"
SRC_URI = "https://github.com/turtlebot-release/turtlebot-release/archive/release/kinetic/turtlebot_bringup/2.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a95c43e6b75a049219cb33dd86329181"
SRC_URI[sha256sum] = "3488036d173c68cd3716bb6bcd0c89904fac99c0dff06a9cda40112f8b0012c5"
S = "${WORKDIR}/turtlebot-release-release-kinetic-turtlebot_bringup-2.4.2-0"

inherit catkin
